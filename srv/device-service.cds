using dshop.smartgarden as my from '../db/data-model';

service DevicesService {
    @readonly entity Devices as projection on my.Devices;
}