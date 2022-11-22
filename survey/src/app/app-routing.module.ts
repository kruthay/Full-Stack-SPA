
//The module file to import route related dependencies

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateSurveyComponent } from './create-survey/create-survey.component';
import { StudentlistComponent } from './studentlist/studentlist.component';
import { UpdateStudentComponent } from './update-student/update-student.component';

const routes: Routes = [
  {path: 'students', component: StudentlistComponent},
  {path: 'newsurvey', component : CreateSurveyComponent},
  {path: 'update-student/:id', component : UpdateStudentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
