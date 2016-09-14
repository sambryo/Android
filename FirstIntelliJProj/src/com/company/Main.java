    package com.company;

    public class Main {


        public static void main (String [] args ) {


            class TriangularNumber {
                int number ;

                boolean isSquare = false;

                double sqrtOfnumber = Math.sqrt(number);

                public boolean isSquare(){

                    if ( sqrtOfnumber == Math.floor(sqrtOfnumber)){
                        System.out.println(number + " This is a square number");
                        isSquare = true;

                    }else{
                        System.out.println(number + " This is not a square number");
                        isSquare = false;
                    }
                    return isSquare;
                    }


                public boolean isTriangularNumber () {
                    int x = 1;
                    int triangularNumber = 1;

                    while ( triangularNumber < number) {

                        x ++;
                        triangularNumber += x;
                    }
                    boolean returnValue ;
                    if (number == triangularNumber ){
                        System.out.println(number + " This is a a triangular number");
                        returnValue = true;
                    }else{
                        System.out.println(number + " This is not a a triangular number");
                        returnValue = false;
                    }
                    return returnValue;
                }


            }
            TriangularNumber triObj = new TriangularNumber ();
            triObj.number = 9;
            System.out.println(triObj.isTriangularNumber());
            System.out.println(triObj.isSquare());

        }

    }
