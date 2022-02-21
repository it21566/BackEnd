import Company from '../../Entities/Company';
import Contact from '../../Entities/Contact';
import Status from '../../Entities/Status';

/**
 * This module is generated from gr.hua.dit.MyApplication.service.CrmService.CrmData.
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file:///C:/Users/Ody/Desktop/MyApplication/src/main/java/gr/hua/dit/MyApplication/service/CrmService.java}
 */
export default interface CrmData {
  contacts: Array<Contact>;
  companies: Array<Company>;
  statuses: Array<Status>;
}
