import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AddCustomerComponent} from  './add-customer/add-customer.component';
import {CustomerComponent} from  './customer/customer.component';
import { UpdateCustomerComponent } from './update-customer/update-customer.component';




const routes: Routes = [

  {path:'customers',component:CustomerComponent},
  {path:'customer',component:AddCustomerComponent},
  {path:'upcustomer/:id',component:UpdateCustomerComponent},
  {path:'',component:CustomerComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
