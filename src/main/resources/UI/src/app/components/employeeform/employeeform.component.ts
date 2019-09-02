import { Component, OnInit } from '@angular/core';
import {Emmployee} from '../../models/emmployee.model';
import { Router } from '@angular/router';
import { EmployeeserviceService } from '../../service/employeeservice.service';
@Component({
  selector: 'app-employeeform',
  templateUrl: './employeeform.component.html',
  styleUrls: ['./employeeform.component.css']
})
export class EmployeeformComponent implements OnInit {

  employee = new Emmployee();
  constructor(private employeeService: EmployeeserviceService, private router: Router) { }

  ngOnInit() {
  }
  onSubmit() {
    this.employeeService.postEmployee(this.employee).subscribe(
      data => console.log('Success', data),
      error => console.log('Error', error)
    );
    this.router.navigate(['/']);
  }

}
