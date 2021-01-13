#! /bin/sh

echo "Granting privilieges to apache2 to read files hosted"
chgrp -R www-data /var
chmod -R 775 /var

mv httpd.conf /etc/apache2/httpd.conf

echo "Bringing apache2 to foreground"
/usr/sbin/httpd -D FOREGROUND

exec "$@"


