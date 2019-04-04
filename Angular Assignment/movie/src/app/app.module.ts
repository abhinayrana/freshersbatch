import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IndexComponent } from './components/index/index.component';
import { CreateComponent } from './components/create/create.component';
import { MoviesService } from './movies.service';
import { appRoutes } from './routerConfig';
import {HttpClientModule} from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { SearchPipe } from './components/index/select.pipe';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    IndexComponent,
    CreateComponent,
    SearchPipe
   
  ],
  imports: [
    BrowserModule,AppRoutingModule,FormsModule,
    
    RouterModule.forRoot(appRoutes), HttpClientModule,ReactiveFormsModule
    
  ],
  providers:[MoviesService],
  bootstrap: [AppComponent],
  
})
export class AppModule { }
