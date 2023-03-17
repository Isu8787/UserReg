import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss']
})
export class UserComponent {
  name: string ="";
  password: string ="";
  confirmpassword: string ="";
  email: string ="";
  mobile: Number =0;
 
  constructor(private http: HttpClient)
  {}
 
register()
  {
  
    let bodyData = {
      "name" : this.name,
      "password" : this.password,
      "confirmpassword" : this.confirmpassword,
      "email" : this.email,
      "mobile" : this.mobile
    };
    this.http.post("http://localhost:8080/api/v1/user/save",bodyData).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Employee Registered Successfully")
        
        this.name = '';
        this.password = '';
        this.confirmpassword = '';
        this.email = '';
       this.mobile  = 0;
    });
  }
save()
  {
        this.register();
  }

}
