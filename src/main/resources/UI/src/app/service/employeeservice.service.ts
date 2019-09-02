import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Emmployee } from '../models/emmployee.model';

@Injectable(
  {
  providedIn: 'root'
}
)
export class EmployeeserviceService {
  private baseUrl = `http://localhost:8080`;
  // tslint:disable-next-line: variable-name
  constructor(private _http: HttpClient) { }
getEmployees() {
  return this._http.get<Emmployee[]>(this.baseUrl);
}
postEmployee(employee: Emmployee) {
  return this._http.post<any>(this.baseUrl + '/store_user', employee);
}
}
