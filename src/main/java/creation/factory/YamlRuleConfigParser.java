package creation.factory;


public class YamlRuleConfigParser implements IRuleConfigParser {
    @Override
    public String parser(String sourceType) {
        return "yaml config";
    }
}
