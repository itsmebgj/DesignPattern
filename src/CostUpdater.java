public class CostUpdater {
    private Strategy strategy;

    public CostUpdater(Strategy strategy) {
        this.strategy = strategy;
    }

    public double updateCost(int cost, int count) {
        return strategy.excuteUpdateDifference(cost, count);
    }

    public static void main(String[] args) {
        Strategy payerStrategy = new PayerStrategies();
        Strategy senderStrategy = new SenderStrategies();

        CostUpdater updater = new CostUpdater(payerStrategy);
        System.out.println(updater.updateCost(100, 5));  // Payer 전략을 사용하여 업데이트

        updater = new CostUpdater(senderStrategy);
        System.out.println(updater.updateCost(100, 5));  // Sender 전략을 사용하여 업데이트
    }
}