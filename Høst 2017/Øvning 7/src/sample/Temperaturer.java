package sample;
import java.util.Random;

public class Temperaturer {
    public String monede;
    public int[][]tempraturer = new int[31][24];

    public Temperaturer (String Monede) {
        this.monede = monede;
        tempraturer = FyllMedRandomShit(tempraturer);
    }

    public int[][] getArray () {
        return tempraturer;
    }

    public int[][] FyllMedRandomShit(int[][] array) {
        Random randomGen = new Random();
        for(int i=0; i!=31; i++) {
            int a = randomGen.nextInt(8)-2;
            int b = randomGen.nextInt(3)+8;
            for(int j=0; j!=24; j++) {
                array[i][j] = (int) (b*Math.sin(j/3.8+3.64))+a+randomGen.nextInt(3);
            }
        }
        return array;
    }

    public int[] MiddelTempDag() {
        int[] middelTempDag = new int[31];
        for(int j=0; j!=31; j++) {
            int gjennomsnit = 0;
            for (int i = 0; i != 24; i++) {
                gjennomsnit = tempraturer[j][i] + gjennomsnit;
            }
            middelTempDag[j] = gjennomsnit / 24;
        }
        return middelTempDag;
    }

    public int[] MiddelTempTime(int time){
        int[] middelTempTime = new int[31];
        for(int i=0; i!=31; i++) {
           middelTempTime[i]=tempraturer[i][time];
        }
        return middelTempTime;
    }

    public int MiddelTempManed() {
        int middelTempManed = 0;
        for(int i=0; i != 31; i++) {
            for(int j=0; j != 24; j++) {
                middelTempManed = middelTempManed + tempraturer[i][j];
            }
        }
        return middelTempManed/24/31;
    }

    public int[] AntalDognMiddelTemp() {
        int[] antalDognMiddelTemp = new int[5];
        int[] tempDag = MiddelTempDag();
        for (int i=0;i!=31;i++) {
            if(tempDag[i]<=(-5)){
                antalDognMiddelTemp[0]++;
            } else if(tempDag[i]>(-5) && tempDag[i]<=0) {
                antalDognMiddelTemp[1]++;
            } else if(tempDag[i]>0&&tempDag[i]<5) {
                antalDognMiddelTemp[2]++;
            } else if((tempDag[i]>=5&&tempDag[i]<10)){
                antalDognMiddelTemp[3]++;
            } else {
                antalDognMiddelTemp[4]++;
            }
        }
        return antalDognMiddelTemp;

    }
}
