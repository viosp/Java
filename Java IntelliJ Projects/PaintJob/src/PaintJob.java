public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.26,0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        //width = width of the wall
        //height = height of the wall
        //areaPerBucket = area that can be covered with one bucket of paint
        //extraBuckets = bucket count that Bob has at home

        //method returns (int) number of buckets Bob needs to buy before going to work.
        double bucketsNeeded = 0;

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        } else {
            double area = width * height;
            double leftArea = (area - (areaPerBucket * extraBuckets));
            if ((leftArea) <= area) {
                bucketsNeeded = Math.ceil(leftArea / areaPerBucket);

            }
        }
        return (int) bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double bucketsNeeded = 0;

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        } else {
            double area = width * height;
            bucketsNeeded = Math.ceil(area / areaPerBucket);
        }
        return (int) bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        double bucketsNeeded = 0;

        if ((area <= 0) ||  (areaPerBucket <= 0)) {
            return -1;
        } else {
            bucketsNeeded = Math.ceil(area / areaPerBucket);
        }
        return (int) bucketsNeeded;
    }

}
