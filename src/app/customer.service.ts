import { Injectable } from '@angular/core';
import {HttpHeaders,HttpClient} from '@angular/common/http';
import {Customer} from './customer';



@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http : HttpClient) { }
  private userUrl = 'http://localhost:9988/customer';
  private upuserUrl='http://localhost:9988/upcustomer';
//private userUrl = '/customer';

public getCustomer() {
  return this.http.get(this.userUrl+"s");
}

public getCustomerId(customer) {
  return this.http.get(this.userUrl+"/"+customer.custID);
}


public deleteCustomer(customer) {
  return this.http.delete(this.userUrl + "/"+ customer.custID);
}

public createCustomer(customer) {

  return this.http.post<Customer>(this.userUrl, customer);
}

public updateCustomer(customer,id2) {

  return this.http.put<Customer>(this.upuserUrl+"/"+id2, customer);
}


}
