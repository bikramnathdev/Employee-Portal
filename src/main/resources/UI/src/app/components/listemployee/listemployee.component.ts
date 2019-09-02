import { Component, OnInit } from '@angular/core';
import { Emmployee } from 'src/app/models/emmployee.model';
import { EmployeeserviceService } from 'src/app/service/employeeservice.service';

@Component({
  selector: 'app-listemployee',
  templateUrl: './listemployee.component.html',
  styleUrls: ['./listemployee.component.css']
})
export class ListemployeeComponent implements OnInit {
employees$: Emmployee[];
  constructor(private employeeService: EmployeeserviceService) { }

  ngOnInit() {
    return this.employeeService.getEmployees()
    .subscribe(data => this.employees$ = data);
  }

}
