package org.sgitario.jbpm;

import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaEventListener;
import org.kie.api.event.rule.AgendaGroupPoppedEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.kie.api.event.rule.MatchCancelledEvent;
import org.kie.api.event.rule.MatchCreatedEvent;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.event.rule.RuleFlowGroupDeactivatedEvent;

import io.prometheus.client.Counter;

public class RulesMatchedCountAgendaEventListener implements AgendaEventListener {

	protected static final Counter counter = Counter.build().name("rules_matched_count").help("Count of matched rules.")
			.labelNames("rule_name").register();

	@Override
	public void afterMatchFired(AfterMatchFiredEvent event) {
		counter.labels(event.getMatch().getRule().getName()).inc();
	}

	@Override
	public void matchCreated(MatchCreatedEvent event) {

	}

	@Override
	public void matchCancelled(MatchCancelledEvent event) {

	}

	@Override
	public void beforeMatchFired(BeforeMatchFiredEvent event) {

	}

	@Override
	public void agendaGroupPopped(AgendaGroupPoppedEvent event) {

	}

	@Override
	public void agendaGroupPushed(AgendaGroupPushedEvent event) {

	}

	@Override
	public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {

	}

	@Override
	public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {

	}

	@Override
	public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {

	}

	@Override
	public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {

	}

}
