/**
 * 
 */function reversingString(str) {
        
    // return a new array of strings
    const arrayStrings = str.split("");
           
    // reverse the new created array elements
    const reversingArray = arrayStrings.reverse();
         
    // join all elements of the array into a string
    const joinArray = reversingArray.join("");
            
    // return the reversed string
    return joinArray;
}
         
// taking input from the user
const string = prompt('Enter a string: ');
        
const result = reversingString(string);
console.log(result);
