package creation.factory;


public class JsonRuleConfigParser implements IRuleConfigParser {
    @Override
    public String parser(String sourceType) {
        return "json config";
    }
}
