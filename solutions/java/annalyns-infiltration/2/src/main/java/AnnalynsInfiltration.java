
import java.security.KeyManagementException;
import java.util.concurrent.PriorityBlockingQueue;

import javax.xml.crypto.dsig.keyinfo.KeyName;

import com.sun.nio.sctp.PeerAddressChangeNotification;

class AnnalynsInfiltration {

    /*
    Fast attack: a fast attack can be made if the knight is sleeping,
     as it takes time for him to put on his armor, leaving him vulnerable.
     */
    public static boolean canFastAttack(boolean knightIsAwake) {
        return knightIsAwake ? false: true;
    }

    /**
     * Spy: the group can be spied upon if at least one of them is awake. Otherwise,
     *  spying is a waste of time.
     */
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake||archerIsAwake||prisonerIsAwake?true:false;
    }

    /**
     * Signal prisoner: the prisoner can be signaled using bird sounds if the prisoner is awake and the archer is sleeping.
     *  Archers are trained in bird signaling and could intercept the message if they are awake.
     */
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake&&!archerIsAwake?true:false;
    }

    /*
    Free prisoner: Annalyn can attempt to sneak into the camp to free the prisoner. 
    This is risky and can only succeed in one of two ways:
    
    If Annalyn has her pet dog, she can rescue the prisoner if the archer is asleep.
     The knight is scared of the dog and the archer will not have time to get ready before Annalyn and the prisoner can escape.

    If Annalyn does not have her pet dog, then she and the prisoner must be very sneaky! 
    Annalyn can free the prisoner if the prisoner is awake and both the knight and archer are sleeping.
    However, if the prisoner is sleeping, they can't be rescued, as the prisoner would be startled by Annalyn's
    sudden appearance and wake up the knight and archer. */
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
    boolean freedom = false;

    if(petDogIsPresent){
        freedom = archerIsAwake?false:true;
    }else{
        freedom = prisonerIsAwake&&(!knightIsAwake&&!archerIsAwake)?true:false;
    }
    return freedom;
}