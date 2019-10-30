package jarvis.jenkins.lib.config.deployment.terraform

import com.cloudbees.groovy.cps.NonCPS
import jarvis.jenkins.lib.config.AbstractConfig

class TerraformDeploymentConfig extends AbstractConfig implements Serializable {
    private String jarvisTfVersion

    @NonCPS
    String getJarvisTfVersion() {
        return jarvisTfVersion
    }

    @NonCPS
    void setJarvisTfVersion(String jarvisTfVersion) {
        this.jarvisTfVersion = jarvisTfVersion
    }
}
