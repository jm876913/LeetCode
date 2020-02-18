/**
*Given a valid (IPv4) IP address, return a defanged version of that IP address.

*A defanged IP address replaces every period "." with "[.]".
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

*/

/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    var toreturn = "";
    
    for(var i = 0; i < address.length; i++){
        if(address[i] == "."){
           toreturn += "[.]"
        }
        else{
            toreturn += address[i];
        }
        
    }
    return toreturn;
    
};