//Script file for the component


import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-create-survey',
  templateUrl: './create-survey.component.html',
  styleUrls: ['./create-survey.component.css']
})
export class CreateSurveyComponent implements OnInit {
  student: Student = new Student();
  constructor(private studentService : StudentService,
    private router: Router) { }

  ngOnInit(): void {
  }

    saveSurvey(){
      this.studentService.createSurvey(this.student).subscribe(data =>{
        console.log(data);

        this.goToSurveyList();
      },
      error => console.log(error));
    }

    goToSurveyList(){
      this.router.navigate(['/students']);
    }
    onSubmit(){
      console.log(this.student);
      alert("The Form has been Submitted.");
      this.saveSurvey()
    }
}
