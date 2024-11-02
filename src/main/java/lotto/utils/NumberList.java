package lotto.utils;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import lotto.constant.ExceptionMessage;


public class NumberList extends ArrayList<Integer> {

    static final int[] NUMBER_RANGE = {1,45};
    static final int NUMBER_RANGE_START = 0;
    static final int NUMBER_RANGE_END = 1;

    static final int  MAX_SIZE = 6;

    public NumberList(){
        super();
    }

    static public void isListOverMaxLength(List<Integer> list, int maxLength){
        /*TODO
         * Exception Message를 ENUM 이나 상수로 정의하여 사용하기.
         * */
        if(list.size() > maxLength){
            throw new IllegalArgumentException(ExceptionMessage.LIST_OVER_MAX_LENGTH.getMessage());
        }
    }

    public int generateRandomNumber(){
        return Randoms.pickNumberInRange( NUMBER_RANGE[NUMBER_RANGE_START], NUMBER_RANGE[NUMBER_RANGE_END]);
    }


    public NumberList addNewNumber(int newNumber){


        if(isAddPossible()&&!isAlreadyNumberAdded(newNumber)){
            this.add(newNumber);
        }

        return sortAscending();
    }

    public boolean isAlreadyNumberAdded(int newNumber){
        boolean[] isNumberGenerated = new boolean[NUMBER_RANGE[NUMBER_RANGE_END]+1];

        for(int num : this ){
            isNumberGenerated[num] = true;
        }

        return isNumberGenerated[newNumber];

    }

    public boolean isAddPossible(){
        return this.size() < MAX_SIZE;
    }

    public NumberList generateRandomNumberList(){

        while(isAddPossible()){
            int newNumber = generateRandomNumber();
            addNewNumber(newNumber);
        }

        return sortAscending();

    }

    public NumberList sortAscending() {
        this.sort(Comparator.naturalOrder());

        return this;
    }

}
