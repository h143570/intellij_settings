#parse("Copyright Notice.java")

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public (choose one of){class|interface|enum|@interface} ${NAME} {
}