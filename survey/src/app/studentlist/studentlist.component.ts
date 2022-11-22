//Script file for the component

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';
@Component({
  selector: 'app-studentlist',
  templateUrl: './studentlist.component.html',
  styleUrls: ['./studentlist.component.css']
})
export class StudentlistComponent implements OnInit {

  students: Student[] = [];
  constructor(private studentService: StudentService,
    private router: Router) { }

  ngOnInit(): void {

    this.getStudents();
  }
private getStudents(){
  this.studentService.getStudentsList().subscribe(data => {
    this.students = data;
  });
}

updateStudent(id:number){
  this.router.navigate(['update-student', id]);
}
deleteStudent(id : number){
  this.studentService.deleteStudent(id).subscribe( data =>{
    console.log(data);
    this.getStudents();
  })
}
}
