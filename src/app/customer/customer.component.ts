import { Component, OnInit } from '@angular/core';
import {CustomerService} from  '../customer.service';
import {Router} from '@angular/router';
import {Customer} from '../customer';

@Component({ 
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  customers;
  constructor(private router:Router,private service:CustomerService) { }

  ngOnInit() {
    this.service.getCustomer().subscribe(data =>{ this.customers=data;});
  }

  deleteCustomer(cust : Customer) :void{

    this.service.deleteCustomer(cust).subscribe(data =>{
      this.customers=this.customers.filter(u=> u!==cust);
    })
}





}
  