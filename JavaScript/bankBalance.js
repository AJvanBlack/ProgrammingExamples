var balance = 100;
var checkBalance = true;
var isActive = true;

  if (checkBalance === false && isActive === false) {
    console.log("Thank you. Have a nice day!");
} else if (isActive === true && balance > 0) {
    console.log("Your balance is $" + balance + ".");
} else if (balance === 0) {
    console.log("Your account is empty");
} else if (checkBalance === true && isActive === false) {
    console.log("Your account is no longer active");
} else {
    console.log("Your balance is negative. Please contact the bank");
}
