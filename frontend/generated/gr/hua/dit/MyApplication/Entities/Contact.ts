import AbstractEntity from '../AbstractEntity';
import Company from './Company';
import Status from './Status';

/**
 * This module is generated from gr.hua.dit.MyApplication.Entities.Contact.
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file:///C:/Users/Ody/Desktop/MyApplication/src/main/java/gr/hua/dit/MyApplication/Entities/Contact.java}
 */
export default interface Contact extends AbstractEntity {
  firstName?: string;
  lastName?: string;
  company?: Company;
  status?: Status;
  email?: string;
}
