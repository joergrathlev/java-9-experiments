# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|
  config.vm.box = "centos/7"

  config.vm.provision "shell", inline: <<-SHELL
    sudo mkdir -p /usr/lib/jvm
    cd /usr/lib/jvm
    sudo tar -xzf /vagrant/jigsaw-jdk-9-ea+158_linux-x64_bin.tar.gz
    printf "export JAVA_HOME=/usr/lib/jvm/jdk-9\npathmunge /usr/lib/jvm/jdk-9/bin after\n" | sudo tee /etc/profile.d/java.sh >/dev/null
    cd /opt
    sudo tar -xzf /vagrant/apache-maven-3.3.9-bin.tar.gz
    sudo ln -s /opt/apache-maven-3.3.9/bin/mvn /usr/bin/mvn 
  SHELL
end
