package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }





    public String whileLoop() {
        StringBuilder result = new StringBuilder();

        int counter = 0;
        while(counter<personArray.length) {
           String x = String.valueOf(personArray[counter]);
           result.append(x);
           counter++;
        }


        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result.toString();
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder();
        int counter;

        // identify initial value i
        // identify terminal condition what ever is at the end of the < sign
        // identify increment i++

        for(counter = 0; counter<personArray.length; counter++) {
            String x = String.valueOf(personArray[counter]);
            result.append(x);
        }

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder();

        // identify array's type
        // identify array's variable-name
        for(Person counter: personArray){
            result.append(counter);

        }


        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
