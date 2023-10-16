// Function to sort an array in descending order
function sortDescending(arr) {
  arr.sort(function(a, b) {
    return b - a;
  });
}

// Prompt the user to enter numbers
var input = prompt("Enter a list of numbers separated by commas:");
var numbers = input.split(",").map(function(item) {
  return parseFloat(item);
});

// Check if the input is valid
if (!numbers.every(Number.isFinite)) {
  console.log("Invalid input. Please enter valid numbers.");
} else {
  sortDescending(numbers);
  console.log("Sorted array in descending order: " + numbers);
}
