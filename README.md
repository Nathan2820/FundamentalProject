# **Fantasy XV README**

My project is going to be a Fantasy XV Rugby Union team selector. Users will be able to create 
their own custom teams, after which they can save for later retrieval. 

## Requirements for the App:
The project specification required me to create a CRUD web application, where CRUD stands for:
* **C**reate - The user must be able to create something which can be stored.
* **R**ead - The user must be able to view something they have previously created.
* **U**pdate - The user must be able to edit and store changes to their created work.
* **D**elete - The user must be able to delete what they have created.

## Risk Assessment
Risks are a major part of every project and something that 
needs to be addressed. Each project has its own potential risks,
and mine is no exception. Because of this, I have analysed risks
which cover the whole scope of the project as to ensure that
each area has precautions in place to ensure that the risks are
mitigated, not only in specific areas but as a whole for the project.

Within my risk assessment I will be using different levels to classify the risks
in given areas, these are as follows:
* Likelihood
    * High - This means that chance of this risk occurring is very likely and
    that there are not any or very little mitigating factors in place to prevent
    this risk from occurring.
    * Medium - This means that there is a chance of the risk occurring but there
    are mitigating factors in place to prevent this.
    * Low - This means that there is little chance of the risk occurring.
* Impact
    * High - The risk can cause a severe or catastrophic failure of the site
    resulting in no access or a malfunction.
    * Medium - The risk can cause a malfunction on the site but won't result
    in any major impacts such as loss of data.
    * Low - The risk can't cause any major impact because measures are in
    place to recover from this risk.
* Tolerance
    * Tolerate - No action taken because the preventative measures in place
    are sufficient to manage the consequences of the risk.
    * Handle - Action taken to mitigate the consequences of the risk.
    
| Risk | Description | Likelihood | Impact | Responsibility | Current Mitigation | Intended Mitigation | Response | Tolerate? |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| Unable to access SQL Database | For any array of reasons (no internet connection for example), accessing GCP to access the mySQL database could fail and not be possible and this would result in the web application being in an unusable state. | Low | Medium | GCP | None | Setup multiple local and external backups of the Database so that it can be hosted from multiple locations. | Try to access GCP multiple times and if this still fails then contact the GCP helpline. | tolerate |
| Unable to access the VM hosting the DB | If for some reason the specific VM hosting the DB becomes inaccessible on GCP the web application will no longer be able to perform the required tasks. | Low | | | | | | |