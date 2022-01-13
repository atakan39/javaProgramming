package utilities;

public class ArraysUtility {

//---------PrintEach


        // print each integer of integer array in separate lines
        public static void printEach(int[] array) {
                for (int each : array) {
                        System.out.println(each);
                }
        }            //tested

        // print each double of double array in separate lines
        public static void printEach(double[] array) {
                for (double each : array) {
                        System.out.println(each);
                }
        }         //tested

        // print ach String of String array in separate lines
        public static void printEach(String[] array) {
                for (String each : array) {
                        System.out.println(each);
                }
        }         //tested

        // print each char of char array in separate lines
        public static void printEach(char[] array) {
                for (char each : array) {
                        System.out.println(each);
                }
        }            //tested


//--------- Max of Array

        //returns the maximum number for integer array
        public static int maxElement(int[] array) {

                int max = array[0];
                for (int each : array) {
                        if (each > max) {
                                max = each;
                        }
                }
                return max;
        }                // tested

        //returns the maximum number for double array
        public static double maxElement(double[] array) {

                double max = array[0];
                for (double each : array) {
                        if (each > max) {
                                max = each;
                        }
                }
                return max;
        }

        //returns the maximum number for long array
        public static long maxElement(long[] array) {

                long max = array[0];
                for (long each : array) {
                        if (each > max) {
                                max = each;
                        }
                }
                return max;
        }

        //returns the maximum number for short array
        public static short maxElement(short[] array) {

                short max = array[0];
                for (short each : array) {
                        if (each > max) {
                                max = each;
                        }
                }
                return max;
        }

        //returns the maximum number for byte array
        public static byte maxElement(byte[] array) {

                byte max = array[0];
                for (byte each : array) {
                        if (each > max) {
                                max = each;
                        }
                }
                return max;
        }

        //returns the maximum number for float array
        public static float maxElement(float[] array) {

                float max = array[0];
                for (float each : array) {
                        if (each > max) {
                                max = each;
                        }
                }
                return max;
        }

//--------- Min of Array

        //returns the maximum number for integer array
        public static int minElement(int[] array) {

                int min = array[0];
                for (int each : array) {
                        if (each < min) {
                                min = each;
                        }
                }
                return min;
        }

        //returns the maximum number for double array
        public static double minElement(double[] array) {

                double min = array[0];
                for (double each : array) {
                        if (each < min) {
                                min = each;
                        }
                }
                return min;
        }

        //returns the maximum number for long array
        public static long minElement(long[] array) {

                long min = array[0];
                for (long each : array) {
                        if (each < min) {
                                min = each;
                        }
                }
                return min;
        }

        //returns the maximum number for short array
        public static short minElement(short[] array) {

                short min = array[0];
                for (short each : array) {
                        if (each < min) {
                                min = each;
                        }
                }
                return min;
        }

        //returns the maximum number for byte array
        public static byte minElement(byte[] array) {

                byte min = array[0];
                for (byte each : array) {
                        if (each < min) {
                                min = each;
                        }
                }
                return min;
        }

        //returns the maximum number for float array
        public static float minElement(float[] array) {

                float min = array[0];
                for (float each : array) {
                        if (each < min) {
                                min = each;
                        }
                }
                return min;
        }


// ------------reverseArray

        // reverse int array
        public static int[] reverseArray(int[] array) {

                int[] reverse = new int[array.length];

                for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                        reverse[j] = array[i];
                }

                return reverse;
        }

        // reverse double array
        public static double[] reverseArray(double[] array) {

                double[] reverse = new double[array.length];

                for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                        reverse[j] = array[i];
                }

                return reverse;
        }

        // reverse char array
        public static char[] reverseArray(char[] array) {

                char[] reverse = new char[array.length];

                for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                        reverse[j] = array[i];
                }

                return reverse;
        }

        // reverse String array
        public static String[] reverseArray(String[] array) {

                String[] reverse = new String[array.length];

                for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                        reverse[j] = array[i];
                }

                return reverse;
        }


// --------------mergeArray


        // merges two integer array
        public static int[] mergeArray(int arr1[], int arr2[]) {

                int merge[] = new int[arr1.length + arr2.length];

                int count = 0;

                for (int each : arr1) {
                        merge[count++] = each;
                }
                for (int each : arr2) {
                        merge[count++] = each;
                }

                return merge;
        }

        // merges two double array
        public static double[] mergeArray(double arr1[], double arr2[]) {

                double merge[] = new double[arr1.length + arr2.length];

                int count = 0;

                for (double each : arr1) {
                        merge[count++] = each;
                }
                for (double each : arr2) {
                        merge[count++] = each;
                }

                return merge;
        }

        // merges two String array
        public static String[] mergeArray(String arr1[], String arr2[]) {

                String merge[] = new String[arr1.length + arr2.length];

                int count = 0;

                for (String each : arr1) {
                        merge[count++] = each;
                }
                for (String each : arr2) {
                        merge[count++] = each;
                }

                return merge;
        }  //tested

        // merges two char array
        public static char[] mergeArray(char arr1[], char arr2[]) {

                char merge[] = new char[arr1.length + arr2.length];

                int count = 0;

                for (char each : arr1) {
                        merge[count++] = each;
                }
                for (char each : arr2) {
                        merge[count++] = each;
                }

                return merge;
        }


        // ---------------addElement

        // add an integer to an integer array
        public static int[] addElement(int[] array, int element) {
                int[] result = new int[array.length + 1];

                int i = 0; // 0 1 2 3 4 " "
                for (int each : array) {
                        result[i++] = each;
                }

                result[i] = element;

                return result;
        }

        // add a double to a double array
        public static double[] addElement(double[] array, double element) {
                double[] result = new double[array.length + 1];

                int i = 0;
                for (double each : array) {
                        result[i++] = each;
                }
                result[i] = element;

                return result;
        }

        // add an String to a String array
        public static String[] addElement(String[] array, String element) {
                String[] result = new String[array.length + 1];

                int i = 0;
                for (String each : array) {
                        result[i++] = each;
                }
                result[i] = element;

                return result;
        }     //tested

        // add an char to an char array
        public static char[] addElement(char[] array, char element) {
                char[] result = new char[array.length + 1];

                int i = 0;
                for (char each : array) {
                        result[i++] = each;
                }
                result[i] = element;

                return result;
        }

//---------------Contains

        //checks if the given integer is contained in the given array. returns boolean.  contains(int[], int)
        public static boolean contains(int[] array, int element) {

                boolean result = false;

                for (int each : array) {
                        if (each == element) { // if any array's element is matching with the given element, it means the given elements is contained in the array
                                result = true;
                        }
                }

                return result;
        }

        //checks if the given double is contained in the given array. returns boolean.
        public static boolean contains(double[] array, double element) {

                boolean result = false;

                for (double each : array) {
                        if (each == element) {
                                result = true;
                        }
                }

                return result;
        }

        //checks if the given char is contained in the given array. returns boolean.
        public static boolean contains(char[] array, char element) {

                boolean result = false;

                for (char each : array) {
                        if (each == element) {
                                result = true;
                        }
                }

                return result;
        }

        //checks if the given String is contained in the given array. returns boolean.
        public static boolean contains(String[] array, String element) {

                boolean result = false;

                for (String each : array) {
                        if (each.equals(element)) {
                                result = true;
                        }
                }

                return result;
        }

        //---------------Remove Element
//removes choosen integer from integer array
        public static int[] removeElement(int[] array, int element) {
                int result[] = new int[array.length-1];

                int i = 0;
                for (int each : array) {
                        if (element != each){
                                result[i++] = each;}
                }

                return result;
        }        // tested

        //removes choosen double from double array
        public static double[] removeElement(double[] array, double element) {
                double result[] = new double[array.length - 1];

                int i = 0;
                for (double each : array) {
                        if (element != each)
                                result[i++] = each;
                }

                return result;
        }

        //removes choosen String from String array
        public static String[] removeElement(String[] array, String element) {
                String result[] = new String[array.length - 1];

                int i = 0;
                for (String each : array) {
                        if (!element.equals(each))
                        result[i++]=each;
                }

                return result;
        }

        //removes choosen char from char array
        public static char[] removeElement(char[] array, char element) {
                char result[] = new char[array.length - 1];

                int i = 0;
                for (char each : array) {
                        if (element != each)
                                result[i++] = each;
                }

                return result;
        }

// --------------- frequency of element

        //returns the frequency of the given element from the given array
        public static int frequencyOfElement(int[] array, int element) {

                int count = 0;
                for (int each : array) {
                        count = 0;
                        for (int each1 : array) {
                                if (element == each1) {
                                        count++;
                                }
                        }

                }


                return count;
        }        //tested
        //returns the frequency of the given element from the given array
        public static int frequencyOfElement(double[] array, double element) {

                int count = 0;
                for (double each : array) {
                        count = 0;
                        for (double each1 : array) {
                                if (element == each1) {
                                        count++;
                                }
                        }

                }
                return count;
        }  //tested
        //returns the frequency of the given element from the given array
        public static int frequencyOfElement(char[] array, char element) {

                int count = 0;
                for (char each : array) {
                        count = 0;
                        for (char each1 : array) {
                                if (element == each1) {
                                        count++;
                                }
                        }

                }


                return count;
        }
        //returns the frequency of the given element from the given array
        public static int frequencyOfElement(String[] array, String element) {

                int count = 0;
                for (String each : array) {
                        count = 0;
                        for (String each1 : array) {
                                if (element == each1) {
                                        count++;
                                }
                        }

                }


                return count;
        }  //tested

 //-------------  Unique Elements Of array

        // returns the unique elements of the array as a new array
        public static int[] uniqueElements(int[] array){
                int[] result = {}; //new int[0]

                for (int each : array) {

                        if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                                result = ArraysUtility.addElement(result, each);
                        }

                }

                return result;
        }
        // returns the unique elements of the array as a new array
        public static double[] uniqueElements(double[] array){
                double[] result = {}; //new int[0]

                for (double each : array) {

                        if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                                result = ArraysUtility.addElement(result, each);
                        }

                }

                return result;
        }
        // returns the unique elements of the array as a new array
        public static char[] uniqueElements(char[] array){
                char[] result = {}; //new int[0]

                for (char each : array) {

                        if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                                result = ArraysUtility.addElement(result, each);
                        }

                }

                return result;
        }
        // returns the unique elements of the array as a new array
        public static String[] uniqueElements(String[] array){
                String[] result = {}; //new int[0]

                for (String each : array) {

                        if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                                result = ArraysUtility.addElement(result, each);
                        }

                }

                return result;
        }


//-------------   Removes Elements by Index no

        //removes the index from the array, returns new array
        public static int[] removeElementIndex(int[] array, int index){

                if(index < 0 || index > array.length-1){
                        System.err.println("Invalid Index: "+index);
                        System.exit(0);
                }

                int[] result = new int[array.length -1]; //1,2

                int j = 0;
                for (int i= 0; i < array.length; i++) {
                        if(i == index){  // if the index of array is matching with the given index
                                continue; // skip
                        }
                        result[j++] = array[i];
                }

                return result;
        }
        //removes the index from the array, returns new array
        public static double[] removeElementIndex(double[] array, int index){

                if(index < 0 || index > array.length-1){
                        System.err.println("Invalid Index: "+index);
                        System.exit(0);
                }

                double[] result = new double[array.length -1]; //1,2

                int j = 0;
                for (int i= 0; i < array.length; i++) {
                        if(i == index){  // if the index of array is matching with the given index
                                continue; // skip
                        }
                        result[j++] = array[i];
                }

                return result;
        }
        //removes the index from the array, returns new array
        public static char[] removeElementIndex(char[] array, int index){

                if(index < 0 || index > array.length-1){
                        System.err.println("Invalid Index: "+index);
                        System.exit(0);
                }

                char[] result = new char[array.length -1]; //1,2

                int j = 0;
                for (int i= 0; i < array.length; i++) {
                        if(i == index){  // if the index of array is matching with the given index
                                continue; // skip
                        }
                        result[j++] = array[i];
                }

                return result;
        }
        //removes the index from the array, returns new array
        public static String[] removeElementIndex(String[] array, int index){

                if(index < 0 || index > array.length-1){
                        System.err.println("Invalid Index: "+index);
                        System.exit(0);
                }

                String[] result = new String[array.length -1]; //1,2

                int j = 0;
                for (int i= 0; i < array.length; i++) {
                        if(i == index){  // if the index of array is matching with the given index
                                continue; // skip
                        }
                        result[j++] = array[i];
                }

                return result;
        }

//-----------replace()  Replace element by index number with new element

        // replace choosen index element with new int element
        public static  int [] replace(int []array, int index, int newElement){
                if(index<0&&index>array.length-1){
                        System.out.println("Invalid Index: "+index);
                        System.exit(0);
                }

                array[index]=newElement;
                return array;
        }
        // replace choosen index element with new double element
        public static  double [] replace(double []array, int index, double newElement){
                if(index<0&&index>array.length-1){
                        System.out.println("Invalid Index: "+index);
                        System.exit(0);
                }

                array[index]=newElement;
                return array;
        }
        // replace choosen index element with new String element
        public static  String [] replace(String []array, int index, String newElement){
                if(index<0&&index>array.length-1){
                        System.out.println("Invalid Index: "+index);
                        System.exit(0);
                }

                array[index]=newElement;
                return array;
        }
        // replace choosen index element with new char element
        public static  char [] replace(char []array, int index, char newElement){
                if(index<0&&index>array.length-1){
                        System.out.println("Invalid Index: "+index);
                        System.exit(0);
                }

                array[index]=newElement;
                return array;
        }

//---------replaceAll()  Replace all the matching element with new element

        // replaces all the matching old elements of array with new integer element given
        public static int[] replaceAll(int[]array,int oldElement,int newElement){

                for(int i=0; i< array.length; i++){
                        if(array[i]==oldElement){
                                array[i]=newElement;
                        }
                }
                return array;
        }
        // replaces all the matching old elements of array with new double element given
        public static double[] replaceAll(double[]array,double oldElement,double newElement){

                for(int i=0; i< array.length; i++){
                        if(array[i]==oldElement){
                                array[i]=newElement;
                        }
                }
                return array;
        }
        // replaces all the matching old elements of array with new String element given
        public static String[] replaceAll(String[]array,String oldElement,String newElement){

                for(int i=0; i< array.length; i++){
                        if(array[i].equals(oldElement)){
                                array[i]=newElement;
                        }
                }
                return array;
        }
        // replaces all the matching old elements of array with new char element given
        public static char[] replaceAll(char[]array,char oldElement,char newElement){

                for(int i=0; i< array.length; i++){
                        if(array[i]==oldElement){
                                array[i]=newElement;
                        }
                }
                return array;
        }

//--------- removeDuplicates()   Remove duplicated elements

        // removes duplicated integers
        public static int[]removeDuplicates(int[]array){
                int[]result={};

                for (int each :array) {
                        if(!ArraysUtility.contains(result,each)){
                                result=ArraysUtility.addElement(result,each);
                        }
                }

                return result;
        }
        // removes duplicated double
        public static double[]removeDuplicates(double[]array){
                double[]result={};

                for (double each :array) {
                        if(!ArraysUtility.contains(result,each)){
                                result=ArraysUtility.addElement(result,each);
                        }
                }

                return result;
        }
        // removes duplicated char
        public static char[]removeDuplicates(char[]array){
                char[]result={};

                for (char each :array) {
                        if(!ArraysUtility.contains(result,each)){
                                result=ArraysUtility.addElement(result,each);
                        }
                }

                return result;
        }
        // removes duplicated String
        public static String[]removeDuplicates(String[]array){
                String[]result={};

                for (String each :array) {
                        if(!ArraysUtility.contains(result,each)){
                                result=ArraysUtility.addElement(result,each);
                        }
                }

                return result;
        }

}

    


    //merger ***
    //addElements ***
    //removeElements***
    //reverse ***
    //frequencyOfElement***
    //uniqueElement***
    //removeDuplicates***
   //replace***
   // replaceAll***








