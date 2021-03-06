using dshop.smartgarden as my from '../db/data-model';

service GardenService {
    @readonly entity Devices as projection on my.Devices;
}