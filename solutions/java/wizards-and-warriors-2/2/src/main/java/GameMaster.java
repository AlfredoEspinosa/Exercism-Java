

public class GameMaster {

    public String describe(Character character){
        String level = String.valueOf(character.getLevel());
        String characterClass = character.getCharacterClass();
        String hitPoints = String.valueOf(character.getHitPoints());
        return "You're a level "+level+" "+characterClass+" with "+hitPoints+" hit points.";
    }


     public String describe(Destination destination){
        String destintionName = destination.getName();
        String inhabitants = String.valueOf(destination.getInhabitants());
        return "You've arrived at "+destintionName+", which has "+inhabitants+" inhabitants.";
    }

    public String describe(TravelMethod travelMethod){
        String preposition = travelMethod.equals(TravelMethod.HORSEBACK)?"on":"by";
        return "You're traveling to your destination "+preposition+" "+travelMethod.toString().toLowerCase()+".";
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod){
        String describeCharacter = describe(character);
        String describeTravelMethod = describe(travelMethod);
        String describeDestintion = describe(destination);
        return describeCharacter+" "+describeTravelMethod+" "+describeDestintion;
    }
    

    public String describe(Character character, Destination destination){
        String describeCharacter = describe(character);
        String describeDestintion = describe(destination);
        return describeCharacter+" You're traveling to your destination by "+TravelMethod.WALKING.toString().toLowerCase()+". "+describeDestintion;
    }
}
