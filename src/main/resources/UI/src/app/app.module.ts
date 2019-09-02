import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListemployeeComponent } from './components/listemployee/listemployee.component';
import { EmployeeformComponent } from './components/employeeform/employeeform.component';
import { EmployeeserviceService } from './service/employeeservice.service';

const appRoutes: Routes = [
    {path: '', component: ListemployeeComponent},
    {path: 'addemployee', component: EmployeeformComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    ListemployeeComponent,
    EmployeeformComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [EmployeeserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
