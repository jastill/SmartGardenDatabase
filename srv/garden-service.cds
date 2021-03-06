using dshop.smartgarden as my from '../db/data-model';

service DeviceService {
    @readonly entity Devices as projection on my.Devices;
}