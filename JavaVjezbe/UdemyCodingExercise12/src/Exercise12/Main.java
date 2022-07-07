package Exercise12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double width;
        double height;
        double areaPerBucket;
        int extraBuckets;

        System.out.println("Enter width area: ");
        width = scan.nextDouble();


        System.out.println("Enter height area: ");
        height = scan.nextDouble();


        System.out.println("Enter areaperbucket area: ");
        areaPerBucket = scan.nextDouble();


        System.out.println("Enter extrabuckets: ");
        extraBuckets = scan.nextInt();

        if(extraBuckets > 0) {
            System.out.println("You have extra buckets and you need to buy: " + getBucketCount(width, height, areaPerBucket, extraBuckets) + " more");
        }

        if(extraBuckets == 0){
            System.out.println("You have no extra buckets you need: " + getBucketCount(width,height,areaPerBucket) + " buckets");
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            int bucketsToBuy = getBucketCount(width,height,areaPerBucket);
            return bucketsToBuy - extraBuckets;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 ){
            return -1;
        } else {
            double area = width * height;
            int bucketsForWall = getBucketCount(area,areaPerBucket);
            return bucketsForWall;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0 ){
            return -1;
        } else {
            double bucket = Math.ceil(area/areaPerBucket);
            return (int) bucket;
        }
    }


}
