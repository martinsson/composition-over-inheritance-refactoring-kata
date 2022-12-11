import de.elnarion.util.plantuml.generator.PlantUMLClassDiagramGenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlantUML {

    public static void main(String[] args) {


        String packageName = "inheritance";
        generatePlantUml(packageName);
    }

    private static void generatePlantUml(String packageName) {
        List<String> scanpackages = new ArrayList<>();
        scanpackages.add(packageName);
        List<String> hideClasses = new ArrayList<>();
        PlantUMLClassDiagramGenerator generator =
                new PlantUMLClassDiagramGenerator(PlantUML.class.getClassLoader(),
                        scanpackages, packageName + "\\.(Main|Waiter)", hideClasses, false, false);
        try {
            String result = generator.generateDiagramText();
            FileWriter fileWriter = new FileWriter(packageName + ".puml");
            fileWriter.write(result);
            fileWriter.close();
            System.out.println(result);
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
