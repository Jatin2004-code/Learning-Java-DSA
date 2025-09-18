package OOPS;


class superkeyword {
    public static void main(String[] args) {
        Horse h = new Horse();


    }
    }


    class Animal {
        Animal() {
            System.out.println("aniaml constructor is called");

        }
    }


    class Horse extends Animal {
        Horse() {
            super(); // Must be the first statement
            System.out.println("horse constructor is called");
            }
        }
        // ...existing code...

    
