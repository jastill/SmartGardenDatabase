namespace dshop.smartgarden;

using { cuid, managed } from '@sap/cds/common';

entity Devices: cuid, managed  {
  name  : String;
  description  : String;
}