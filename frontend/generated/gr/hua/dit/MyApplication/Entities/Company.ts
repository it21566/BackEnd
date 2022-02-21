import AbstractEntity from '../AbstractEntity';
import Contact from './Contact';

/**
 * This module is generated from gr.hua.dit.MyApplication.Entities.Company.
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file:///C:/Users/Ody/Desktop/MyApplication/src/main/java/gr/hua/dit/MyApplication/Entities/Company.java}
 */
export default interface Company extends AbstractEntity {
  name?: string;
  employees?: Array<Contact | undefined>;
  employeeCount: number;
}
