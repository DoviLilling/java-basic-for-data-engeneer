package com.epam;

import abstrac_classes.AwsDataService;
import abstrac_classes.IbmDataService;

/**
 * @author Evgeny Borisov
 */
public class Main2 {
    public static void main(String[] args) {
        IbmDataService ibmDataService = new IbmDataService();
        ibmDataService.processDataObject("ssd");
        AwsDataService awsDataService = new AwsDataService();
        awsDataService.processDataObject("sds");
    }
}
