public class GeometricBodyController {

    GeometricBody maxVolume(GeometricBody[] bodyArr)
    {
        double maxVolume = 0;
        int indexArrMaxVol = 0;

        for(int i = 0; i < bodyArr.length; i++)
        {
            if(bodyArr[i].getVolume() > maxVolume)
            {
                maxVolume = bodyArr[i].getVolume();
                indexArrMaxVol = i;
            }
        }

        return bodyArr[indexArrMaxVol];
    }

    GeometricBody maxSurface(GeometricBody[] bodyArr)
    {
        double maxSurface = 0;
        int indexArrMaxSurf = 0;

        for(int i = 0; i < bodyArr.length; i++)
        {
            if(bodyArr[i].getSurface() > maxSurface)
            {
                maxSurface = bodyArr[i].getVolume();
                indexArrMaxSurf = i;
            }
        }

        return bodyArr[indexArrMaxSurf];
    }
}