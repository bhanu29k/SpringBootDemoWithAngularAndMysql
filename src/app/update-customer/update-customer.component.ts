import { Component, OnInit } from '@angular/core';
import {CustomerService} from  '../customer.service';
import {Router,ActivatedRoute,ParamMap} from '@angular/router';
import {Customer} from '../customer';

@Component({
  selector: 'app-update-customer',
  templateUrl: './update-customer.component.html',
  styleUrls: ['./update-customer.component.css']
})
export class UpdateCustomerComponent implements OnInit {
  public id1;
  cust:Customer=new Customer();
  customers;
  constructor(private router: Router, private service : CustomerService,private route:ActivatedRoute) { }

  ngOnInit() {

    this.route.paramMap.subscribe((params:ParamMap)=>{
      let id2=parseInt(params.get("id"));
      this.id1=id2;
    })
  }
  
  updateCustomer(cust:Customer): void{
    this.service.updateCustomer(cust,this.id1).subscribe(data=>{
      this.customers=data
    });
  //  alert("Data Updated Successfully");
  }
}
