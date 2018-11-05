import { Component, OnInit } from '@angular/core';
import {CustomerService} from  '../customer.service';
import {Router} from '@angular/router';
import {Customer} from '../customer';
import { TimeoutError } from 'rxjs';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {
  topicHasError=true;
  cust : Customer = new Customer();

  constructor(private router: Router, private service : CustomerService) { }

  ngOnInit() {
  }
  addCustomer():void{
   this.service.createCustomer(this.cust).subscribe( data =>{
      alert("User created SuccessFully.");
      this.topicHasError=true;
    });
  }
}
