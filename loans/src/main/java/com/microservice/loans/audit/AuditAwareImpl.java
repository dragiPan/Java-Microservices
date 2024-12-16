package com.microservice.loans.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    /**
     * Returns the current auditor of the application.
     *
     * This method is used by the auditing framework to populate the `createdBy`
     * and `updatedBy` fields in the `BaseEntity` class.
     *
     * @return the current auditor (in this case, "LOANS_MS").
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("LOANS_MS");
    }
}
