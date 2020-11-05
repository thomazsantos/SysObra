import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, PreloadAllModules } from '@angular/router';
import { Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http'
import { FormsModule } from '@angular/forms';
import { MatIconModule } from '@angular/material/icon';
import { MatMenuModule } from '@angular/material/menu';

import { AppComponent } from './app.component';
import { ClienteListComponent } from './cliente-list/cliente-list.component';
import { ClienteFormComponent } from './cliente-form/cliente-form.component';
import { ClienteServiceService } from './service/cliente-service.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatTableModule } from '@angular/material/table';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatInputModule } from "@angular/material/input";
import { MatListModule } from "@angular/material/list";
import { MatCheckboxModule } from "@angular/material/checkbox"



const appRoutes: Routes = [
  {
    path : 'ClienteList',
    component : ClienteListComponent

  },
  {
    path : 'ClienteAdd',
    component : ClienteFormComponent
  }
];

@NgModule({
  declarations: [
    AppComponent,
    ClienteListComponent,
    ClienteFormComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    MatIconModule, 
    MatTableModule, 
    MatPaginatorModule,
    MatInputModule,
    MatListModule,
    MatMenuModule,
    MatCheckboxModule,
    RouterModule.forRoot(
      appRoutes,
      {
        enableTracing: false, // <-- debugging purposes only
        preloadingStrategy: PreloadAllModules,
      }
    ),
    BrowserAnimationsModule
  ],
  exports: [
    RouterModule
  ],
  providers: [ClienteServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
