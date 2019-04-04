import { Pipe, PipeTransform } from '@angular/core';
@Pipe({
  name: 'movieFilter'
})
export class SearchPipe implements PipeTransform {

  transform(value: any, args?: any): any {
    if (!args) {
      return value;
    }
    return value.filter((val) => {
      let rVal = (val.category.includes(args));
      return rVal;
    })

  }

}
