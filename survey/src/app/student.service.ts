// Service file for the application to inject http urls

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private baseURL = "http://ec2-44-199-247-172.compute-1.amazonaws.com:32696/api/v1/students";

  constructor(private httpClient : HttpClient) { }

  getStudentsList(): Observable<Student[]>{
    return this.httpClient.get<Student[]>(`${this.baseURL}`);
  }

  createSurvey(student : Student) : Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, student);
  }
  getStudentById(id: number) : Observable<Student>{
    return this.httpClient.get<Student>(`${this.baseURL}/${id}`);
  }

  updateStudent(id: number, student: Student) : Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, student);
  }

  deleteStudent(id: number) : Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
}
