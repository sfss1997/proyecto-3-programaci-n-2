/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Domain.Chimera;
import Domain.Configuration;
import Domain.Player;
import Domain.Probabilities;
import Domain.Zombie;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author fabian
 */
public class ReadFiles {
    
    public Configuration readJsonFiles(String difficulty) throws IOException, ParseException{
       
        Configuration configuration = new Configuration();
        Probabilities probabilities = new Probabilities();
        Player player = new Player();
        Chimera chimera = new Chimera();
        Zombie zombie = new Zombie();
        
        String url = ""; 
        switch(difficulty){
            case "Easy":
                url="easy.json";
            break;
            case "Normal":
                url="normal.json";
            break;
            case "Hard":
                url="hard.json";
            break;
            case "Nightmare":
                url="nightmare.json";
            break;
        }
       
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(url));
        
        JSONObject jsonObject = (JSONObject) obj;
        configuration.setSaveFile(jsonObject.get("saveFile").toString());
        configuration.setHeight(Integer.parseInt(jsonObject.get("height").toString()));
        configuration.setWidth(Integer.parseInt(jsonObject.get("width").toString()));
        configuration.setType(jsonObject.get("type").toString());
             
        JSONObject jsonObjectProbabilities = (JSONObject) jsonObject.get("probabilities");
        probabilities.setStone(Integer.parseInt(jsonObjectProbabilities.get("stone").toString()));
        probabilities.setZombie(Integer.parseInt(jsonObjectProbabilities.get("zombie").toString()));
        probabilities.setChimera(Integer.parseInt(jsonObjectProbabilities.get("chimera").toString()));
        
        JSONObject jsonObjectPlayer = (JSONObject) jsonObject.get("player");
        player.setVisionRange(Integer.parseInt(jsonObjectPlayer.get("visionRange").toString()));
        player.setDefense(Integer.parseInt(jsonObjectPlayer.get("defense").toString()));
        player.setShortAttack(Integer.parseInt(jsonObjectPlayer.get("shortAttack").toString()));
        player.setLongAttack(Integer.parseInt(jsonObjectPlayer.get("LongAttack").toString()));
        player.setDelay(Float.parseFloat(jsonObjectPlayer.get("delay").toString()));
        player.setRange(Integer.parseInt(jsonObjectPlayer.get("range").toString()));
                
        JSONObject jsonObjectChimera = (JSONObject) jsonObject.get("chimera");
        chimera.setDefense(Integer.parseInt(jsonObjectChimera.get("defense").toString()));
        chimera.setShortAttack(Integer.parseInt(jsonObjectChimera.get("shortAttack").toString()));
        chimera.setLongAttack(Integer.parseInt(jsonObjectChimera.get("LongAttack").toString()));
        chimera.setDelay(Float.parseFloat(jsonObjectChimera.get("delay").toString()));
        chimera.setRange(Integer.parseInt(jsonObjectChimera.get("range").toString()));
        
        JSONObject jsonObjectZombie = (JSONObject) jsonObject.get("zombie");
        zombie.setDefense(Integer.parseInt(jsonObjectZombie.get("defense").toString()));
        zombie.setShortAttack(Integer.parseInt(jsonObjectZombie.get("shortAttack").toString()));
        zombie.setDelay((Float.parseFloat(jsonObjectZombie.get("delay").toString())));
        zombie.setRange(Integer.parseInt(jsonObjectZombie.get("range").toString()));
        
        
        configuration.setProbabilities(probabilities);
        configuration.setPlayer(player);
        configuration.setZombie(zombie);
        configuration.setChimera(chimera);
        
//        System.out.println(configuration);
                
        return configuration;
    }
    
}
