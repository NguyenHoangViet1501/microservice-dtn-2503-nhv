package vti.dtn.account_service.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vti.dtn.account_service.dto.AccountDTO;
import vti.dtn.account_service.entity.AccountEntity;
import vti.dtn.account_service.repository.AccountRepository;
import vti.dtn.account_service.services.AccountService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public List<AccountDTO> getListAccounts() {
        List<AccountEntity> accountEntities = accountRepository.findAll();
        List<AccountDTO> accountDTOS = new ArrayList<>();
        accountEntities.forEach( accountEntity -> {
            AccountDTO accountDTO = new AccountDTO();
            accountDTO.setId(accountEntity.getId());
            accountDTO.setUsername(accountEntity.getUsername());
            accountDTO.setFirstName(accountEntity.getFirstname());
            accountDTO.setLastName(accountEntity.getLastname());
            accountDTOS.add(accountDTO);
        });
        return accountDTOS;
    }
}
