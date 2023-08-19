/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinografc;

import java.awt.Dimension;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

/**
 *
 * @author lucas
 */
public class Grafico {
    
    //Cria dataset
    public CategoryDataset createDataSet(ArrayList<numbsAle> listaDAle){
    
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for(numbsAle numbsAleat : listaDAle){
            dataSet.addValue(numbsAleat.getAnyVal(), numbsAleat.getAnyRowName(), "");
        }
        return dataSet;
    }
    
    //Cria grafico de barras
    public JFreeChart createBarChart(CategoryDataset dataSet){
        JFreeChart grafic = ChartFactory.createBarChart("Nascimento de meninos e meninas", "", "", dataSet, PlotOrientation.VERTICAL , true, false, false);
        
        return grafic;
    }
    
    //Cria o grafico com os dados
    public ChartPanel criarGrafico(ArrayList<numbsAle> listaDAle){
        CategoryDataset dataSet = this.createDataSet(listaDAle);
        JFreeChart grafic = this.createBarChart(dataSet);
        
        ChartPanel painelGraf = new ChartPanel(grafic);
        painelGraf.setPreferredSize(new Dimension(600, 400));
        
        return painelGraf;
    }
    
}
