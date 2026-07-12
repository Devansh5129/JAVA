package impQ;

public class seconsQUE {
    static void main(String[] args) {
        String startTime="01:00:00";
        String endTime = "01:00:25";
        System.out.println(secondsBetweenTimes(startTime,endTime));
        System.out.println(secondsBetweenTimes1(startTime,endTime));

    }
    //with using split() function for removing :
        public static int secondsBetweenTimes(String startTime, String endTime) {

            // Split the time strings using ":"
            String[] start = startTime.split(":");
            String[] end = endTime.split(":");

            // Convert start time into total seconds
            int startSeconds =
                    Integer.parseInt(start[0]) * 3600 +
                            Integer.parseInt(start[1]) * 60 +
                            Integer.parseInt(start[2]);

            // Convert end time into total seconds
            int endSeconds =
                    Integer.parseInt(end[0]) * 3600 +
                            Integer.parseInt(end[1]) * 60 +
                            Integer.parseInt(end[2]);

            return endSeconds - startSeconds;
        }
        //wihtout using split() { substring method}

            public static int secondsBetweenTimes1(String startTime, String endTime) {

                int sh = Integer.parseInt(startTime.substring(0, 2));
                int sm = Integer.parseInt(startTime.substring(3, 5));
                int ss = Integer.parseInt(startTime.substring(6, 8));

                int eh = Integer.parseInt(endTime.substring(0, 2));
                int em = Integer.parseInt(endTime.substring(3, 5));
                int es = Integer.parseInt(endTime.substring(6, 8));

                int start = sh * 3600 + sm * 60 + ss;
                int end = eh * 3600 + em * 60 + es;

                return end - start;
            }
        }


