package easy;

/**
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:
 * 1. 'A' : Absent.
 * 2. 'L' : Late.
 * 3. 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
 * You need to return whether the student could be rewarded according to his attendance record.
 *
 * Example 1:
 * Input: "PPALLP"
 * Output: True
 *
 * Example 2:
 * Input: "PPALLL"
 * Output: False
 *
 * 解决思路:
 * 计数
 *
 * Created by second on 2017/9/23.
 */
public class StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        String[] records = s.split("");
        int countA = 0;
        int countL = 0;
        for(String record: records){
            if (countA > 1 || countL > 2){
                return false;
            }
            if ("A".equals(record)) {
                countL = 0;
                countA++;
            }
            else if ("L".equals(record)){
                countL++;
            }
            else if ("P".equals(record)){
                countL = 0;
            }
        }
        return countA <= 1 && countL <= 2;
    }

}
